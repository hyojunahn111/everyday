#include <iostream>
#include <string>

using namespace std;

int back2525() {
	int hour = 0;
	int min = 0;
	int plus = 0;

	cin >> hour >> min >> plus;

	int sum = 0;
	sum = min + plus;

	if (sum >= 60) {
		cout << ((hour + (sum / 60)) % 24) << " " << (sum % 60);
	}
	else {
		cout << (hour % 24) << " " << sum;
	}

	return 0;
}