class QuickSort:
  def __init__(self, array):
    self.array = array


  def swap(self, pointer1, pointer2):
    self.array[pointer1], self.array[pointer2] = self.array[pointer2], self.array[pointer1]

  def set_partition(self, left_pointer, right_pointer):
    self.pivot_position = right_pointer
    self.pivot = self.array[self.pivot_position]

    right_pointer = right_pointer - 1

    while(True):
      
      while(self.array[left_pointer] < self.pivot):
        left_pointer = left_pointer + 1

      while(self.array[right_pointer] > self.pivot):
        right_pointer = right_pointer - 1

      if left_pointer >= right_pointer:
        break
      else:
        self.swap(left_pointer, right_pointer)

    self.swap(left_pointer, self.pivot_position)
    return left_pointer

  def quick_sort(self, left_index, right_index):
    if right_index - left_index <= 0:
      return
    
    pivot_position = self.set_partition(left_index, right_index)
    self.quick_sort(left_index, pivot_position -1)
    self.quick_sort(pivot_position + 1, right_index)
