#include <iostream>
#include <string>

using namespace std;

int back1037() {

	int Ncount = 0;
	int tmp;

	cin >> Ncount;

	int *arr = new int[Ncount];

	for (int i = 0; i < Ncount; i++) {
		cin >> arr[i];
	}

	for (int j = 0; j < arr.length - 1; j++) {
		for (int z = j + 1; z < arr.length; z++) {
			if (arr[z] < arr[j]) {
				tmp = arr[z];
				arr[z] = arr[j];
				arr[j] = tmp;
			}
		}
	}

	int firstindex = 0;
	int lastindex = arr.length - 1;
	int result = arr[lastindex] * arr[firstindex];

	cout << (result);

	return 0;
}