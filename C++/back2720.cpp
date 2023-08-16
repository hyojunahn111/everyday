#include <iostream>
#include <string>

using namespace std;

int back2720() {

	int count = 0;
	int price;

	cin >> count;

	for (int i = 0; i < count; i++) {
		cin >> price;

		int Q = price / 25;
		int priceQ = price % 25;

		int D = priceQ / 10;
		int priceD = priceQ % 10;

		int N = priceD / 5;
		int priceN = priceD % 5;

		int P = priceN;

		cout << Q << " " << D << " " << N << " " << P << endl;

	}
	return 0;
}