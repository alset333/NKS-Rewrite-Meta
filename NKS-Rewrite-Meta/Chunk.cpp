#include <iostream>

using namespace std;

#include "Chunk.h"

Chunk::Chunk()
{
}


Chunk::~Chunk()
{
}

Chunk::Chunk(FOURCC id, DWORD size)
{
	chunkID = id;
	chunkSize = size;


}

Chunk::Chunk(FOURCC id, DWORD size, BYTE data[])
{
	chunkID = id;
	chunkSize = size;
	
	chunkData = new BYTE[chunkSize];

}

void Chunk::show()
{
	cout << chunkID;
	cout << chunkSize;
	//cout << chunkData;
}