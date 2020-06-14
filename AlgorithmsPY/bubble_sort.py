##
# Bubble Sort function O(N^2)
##
def bubble_sort(list):
  unsorted_until_index = len(list) - 1
  is_sorted = False

  while not is_sorted:
    is_sorted = True
    for i in range(unsorted_until_index):
      if list[i] > list[i+1]:
        is_sorted = False
        list[i], list[i+1] = list[i+1], list[i]
    
    unsorted_until_index = unsorted_until_index - 1
  
  return list
