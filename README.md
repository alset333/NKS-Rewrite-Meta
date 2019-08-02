## NKS-Rewrite-Meta

Application for rewriting metadata of NKS (Native Kontrol Standard) preset file.

## Installation
```
    TODO
```

## Usage

```
    TODO
```





# Part of forked README below. Not nessicarily applicable.

# TODO





## API

### rewrite(data)

#### data
Type: `Object` or `function(file, metadata [,callback])`

The data or data provider to rewrite for.

##### data.author [optional]
Type: `String`

##### data.bankchain [optional]
Type: `Array` of `String`

The length of array should be 3.

##### data.comment [optional]
Type: `String`

##### data.modes [optional]
Type: `Array` of `String`

##### data.name [optional]
Type: `String`

##### data.types [optional]
Type: 2 dimensional `Array` of `String`

The length of inner array should be 1 or 2

examle:
  [
    ['Piano/Keys'],
    ['Piano/Keys', 'Electric Piano']
  ]

#### function (file, metadata [,callbak])
The functoin to provide data.

##### file
Type: instance of `vinyl` file

##### metadata
Type: `Object`

The metadata of source file.

##### callback
Type: `function(err, data)`

The callback function to support non-blocking data provider.

example metadata of .nksf
```javascript
{
  "UUID": "7E256217-47DA-4746-0001-A4656EF12290",
  "author": "C.Pitman",
  "bankchain": ["Mini V2", "", ""],
  "comment": "",
  "deviceType": "INST",
  "modes": ["Long Release", "Synthetic"],
  "name": "poly5",
  "types": [
    ["Synth Pad", "Basic Pad"],
    ["Synth Pad", "Bright Pad"]
  ],
  "uuid": "",
  "vendor": "Arturia"
}
```

```javascript
{
  "author": "",
  "bankchain": ["Velvet", "MKII", ""],
  "comment": "",
  "deviceType": "INST",
  "modes": ["Sample-based"],
  "name": "69 MKII Spooky Ring Mod",
  "types": [
    ["Piano/Keys"],
    ["Piano/Keys", "Electric Piano"]
  ],
  "uuid": "b9d0a3da-3603-45b9-b5e9-99207f131991",
  "vendor": "AIR Music Technology"
}
```
