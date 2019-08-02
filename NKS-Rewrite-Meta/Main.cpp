#include <iostream>
#include <string>
#include <fstream>

#include "Chunk.h"

using namespace std;



int main() {

	ifstream infile("D:\\pjmaa\\Documents\\GitHub\\NKS-Rewrite-Meta\\Python-NKS-Rewrite-Meta\\BA Analog Pluck [SN].nksf");


	//get length of file
	infile.seekg(0, infile.end);
	const size_t length = infile.tellg();
	infile.seekg(0, infile.beg);


	char buffer[0xFFFFFFFF];

	//read file
	infile.read(buffer, length);

	for (int i = 0; i < length; i++) {
		cout << buffer[i];
	}
	

	return 0;
}
