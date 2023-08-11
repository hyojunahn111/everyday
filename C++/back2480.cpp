#include <iostream>
#include <string>

using namespace std;

int back2480() {
	int a, b, c = 0;
	cin >> a >> b >> c;

	if (a == b && b == c && a == c) {
		cout << (10000 + a * 1000);
	}
	else if (a != b && b != c && a != c) {
		int max = 0;
		if (a > b && a > c) {
			max = a;
		}
		else {
			if (b > c && b > a) {
				max = b;
			}
			else {
				max = c;
			}
		}

		cout << (max * 100);
	}
	else {
		if (a == b || a == c) {
			cout << (1000 + a * 100);
		}
		else {
			if (b == c || b == a) {
				cout << (1000 + b * 100);
			}
			else {
				cout << (1000 + c * 100);
			}
		}
	}

	return 0;
}