##
# Find duplicate function O(N^2)
##
def has_duplicated_value(list):
  list_size = len(list)
  for i in range(list_size):
    for j in range(list_size):
      if i != j & list[i] == list[j]:
        return True
      else:
        continue

  return False

##
# Find duplicate function O(N)
##
def has_duplicated_value2(list):
  list_size = len(list)
  existing_numbers = [0] * (len(list) + 1)
  for i in range(list_size):
    print(i)
    if existing_numbers[list[i]] == 0:
      existing_numbers[list[i]] = 1
    else:
      return True

  return False

list = [1,2,3,4,5,6,7,8,8]
has_duplicated = has_duplicated_value2(list)
print(has_duplicated)