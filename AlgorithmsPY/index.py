from utils import CArray

from selection_sort import selection_sort
from bubble_sort import bubble_sort

list = CArray()
list.set_data()
print(selection_sort(list.data_store))
print(bubble_sort(list.data_store))