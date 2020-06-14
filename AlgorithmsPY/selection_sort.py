##
# Selection Sort function O(N^2 / 2)
##
def selection_sort(list):
  list_length = len(list)
  for i in range(list_length):
    lower_number_index = i
    for j in range(i, list_length):
      if list[j] < list[lower_number_index]:
        lower_number_index = j

    if lower_number_index != i:
      list[i], list[lower_number_index] = list[lower_number_index], list[i]

  return list
