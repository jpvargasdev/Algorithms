def insertion_sort(list):
  for index in range(1, len(list)):
    position = index
    temp_value = list[index]

    while position > 0 and list[position - 1] > temp_value:
      list[position] = list[position - 1]
      position = position - 1

    list[position] = temp_value

  return list
