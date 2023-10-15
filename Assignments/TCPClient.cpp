#include "C:\Users\user\source\repos\TCP\TCP\Common.h"

char* SERVERIP = (char*)"127.0.0.1";
#define SERVERPORT 9000
#define BUFSIZE    512

int main(int argc, char* argv[])
{
	int retval;

	
	if (argc > 1) SERVERIP = argv[1];

	
	WSADATA wsa;
	if (WSAStartup(MAKEWORD(2, 2), &wsa) != 0)
		return 1;

	
	SOCKET sock = socket(AF_INET, SOCK_STREAM, 0);
	if (sock == INVALID_SOCKET) err_quit("socket()");

	// connect()
	struct sockaddr_in serveraddr;
	memset(&serveraddr, 0, sizeof(serveraddr));
	serveraddr.sin_family = AF_INET;
	inet_pton(AF_INET, SERVERIP, &serveraddr.sin_addr);
	serveraddr.sin_port = htons(SERVERPORT);
	retval = connect(sock, (struct sockaddr*)&serveraddr, sizeof(serveraddr));
	if (retval == SOCKET_ERROR) err_quit("connect()");

	
	char buf[BUFSIZE + 1];
	int len;

	
	while (1) {
		// 첫 번째 숫자 입력
		printf("첫 번째 숫자: ");
		int num1;
		scanf("%d", &num1);
		

		// 첫 번째 숫자 전송
		sprintf(buf, "%d ", num1);
		retval = send(sock, buf, strlen(buf), 0);
		if (retval == SOCKET_ERROR) {
			err_display("send()");
			break;
		}

		printf("[TCP 클라이언트] % d바이트를 보냈습니다.", retval);

		// 두 번째 숫자 입력
		printf("두 번째 숫자: ");
		int num2;
		scanf("%d", &num2);

		// 두 번째 숫자 전송
		sprintf(buf, "%d ", num2);
		retval = send(sock, buf, strlen(buf), 0);
		if (retval == SOCKET_ERROR) {
			err_display("send()");
			break;
		}

		printf("[TCP 클라이언트] % d바이트를 보냈습니다.", retval);

		// 여기서 서버의 응답을 기다립니다.
		retval = recv(sock, buf, BUFSIZE + 1, 0);
		if (retval == SOCKET_ERROR) {
			err_display("recv()");
			break;
		}
		else if (retval == 0)
			break;

		buf[retval] = '\0';
		printf("[TCP 클라이언트] %d바이트를 받았습니다.", retval);

		int sum;
		sscanf(buf, "%d", &sum);
		printf("[서버로부터 받은 합계] %d\n", sum);
	}


	
	closesocket(sock);

	
	WSACleanup();
	return 0;
}