from random import seed
from random import randint

class CArray:
  def __init__(self, num_elements = 100):
    self.data_store = [0] * num_elements
    self.pos = 0
    self.num_elements = num_elements

    for i in range(num_elements):
      self.data_store[i] = i
  
  def set_data(self):
    seed(1)
    for i in range(self.num_elements):
      self.data_store[i] = randint(0, 200)

  def clear(self):
    for i in range(len(self.data_store)):
      self.data_store[i] = 0

  def insert(self, element):
    self.data_store[self.pos + 1] = element

  def to_string(self):
    retsrt = ''
    for i in range(len(self.data_store)):
      retsrt += str(self.data_store[i]) + " "
      if i > 0 and i % 10 == 0:
        retsrt += '\n'

    return retsrt

  def swap(self, arr, index1, index2):
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = arr[temp]