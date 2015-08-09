#!/usr/bin/env python

##
# Checks if 2 strings are permutations of each other
##

def isPerm(str1, str2):
  if toDict(str1) == toDict(str2):
    return True
  return False

def toDict(word):
  chars = {}
  for letter in word:
    if letter in chars:
      chars[letter] = chars[letter] + 1
    else:
      chars[letter] = 1
  return chars

print 'yes, say  : ', isPerm('yes', 'say')
print 'cat, tac  : ', isPerm('cat', 'tac')


