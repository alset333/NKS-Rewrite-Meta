import binascii

# filename = 'BA Ampology [CFA].nksf'
filename = 'BA Analog Pluck [SN].nksf'

with open(filename, 'rb') as f:
    data = f.read()

offsetBytes = 0

#read a section of data
def readSomeData(numOfBytes, endianType):
    global offsetBytes
    someData = []
    for i in range(numOfBytes):
        if endianType == "big":
            someData.append(data[offsetBytes]) #add to end of list
        elif endianType == "little":
            someData.insert(0,data[offsetBytes]) #add to beginning of list
        else:
            print("Invalid endian type!")
        offsetBytes += 1 #increment offsetBytes
    return bytes(someData) #returns a bytearray

class Chunk:
    def __init__(self): #read chunk header
        self.ID = readSomeData(4, "big")
        self.size = readSomeData(4, "little")
        self.weirdThing = readSomeData(4, "little")
        self.metaList = readSomeData(1, "big")

#read file header
fileMagic = readSomeData(4, "big")
fileSize = readSomeData(4, "little")
fileType = readSomeData(4, "big")

#prepare chunks
chunks = []
while offsetBytes < int.from_bytes(fileSize, byteorder="big"): #I don't think these are signed
    if readSomeData(1, "big") != bytearray([0]): #detect padding byte - if not padding, undo the increment from readSomeData
        offsetBytes -= 1
    chunks.append(Chunk())
    offsetBytes -= 5
    offsetBytes += int.from_bytes(chunks[-1].size, byteorder="big") #I don't think these are signed

offsetBytes = 12

for i in range(4):
    print(chunks[i].ID, chunks[i].size, chunks[i].weirdThing, chunks[i].metaList)
