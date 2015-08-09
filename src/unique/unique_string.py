def isUnique(word):
  if not word:
    return False
  chars = {};
  for letter in word:
    if letter in chars:
      return False
    chars[letter] = 1
  return True

print 'cool'
print isUnique('cool')

print 'yes'
print isUnique('yes')

print ''
print isUnique('')



