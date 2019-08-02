#pragma once

// Define some types
typedef unsigned long DWORD;
typedef unsigned char BYTE;
typedef DWORD FOURCC;

class Chunk
{
private:
	FOURCC chunkID;		// A four character ASCII identifier
	DWORD chunkSize;	// An unsigned, little-endian 32-bit integer with the length of the chunk data
	BYTE* chunkData;	// The chunk's contents, size is chunkSize
public:
	Chunk();
	~Chunk();


	Chunk(FOURCC, DWORD);
	Chunk(FOURCC, DWORD, BYTE[]);
	void show();
};

