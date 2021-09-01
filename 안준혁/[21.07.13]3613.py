word = input()

bigger = False
underscore = False
makeBigger = False
error = False
small = False

out = []

for alphabet in word:
    if 'a' <= alphabet <= 'z':
        small = True
        if makeBigger:
            out.append(alphabet.upper())
            makeBigger = False
        else:
            out.append(alphabet)
    elif 'A' <= alphabet <= 'Z':
        if small:
            bigger = True
            out.append('_')
            out.append(alphabet.lower())
        else:
            error = True
    elif alphabet == '_':
        if small:
            small = False
            makeBigger = True
            underscore = True
        else:
            error = True
    else:
        error = True

if alphabet == '_':
    print('Error!')

elif (underscore and bigger) or error:
    print('Error!')

else:
    print(''.join(out))