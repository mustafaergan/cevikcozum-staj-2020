#include <iostream>

using namespace std;

int SumOfAr()
{
	int b = 0;
	int n = 5;
	int ar[] = { 5,6,3,1,8 };

	for (int i = 0; i < n; i++)
	{
		b += ar[i];
	}

	cout << b << endl;

	return 0;

}

int main()
{

	SumOfAr();

	return 0;
}