#include <iostream>
#include <string>

using namespace std;

int back25304() {

		int count = 0;
		int total = 0;
		int price = 0;
		int alltotal = 0;
		int num = 0;

		cin >> alltotal >> count;

		for(int i = 0; i < count; i++) {
			cin >> price >> num;

			total += price * num;
		}

		if (total == alltotal) {
			cout << ("Yes");
		}
		else
		{
			cout << ("No");
		}

		return 0;
	}

