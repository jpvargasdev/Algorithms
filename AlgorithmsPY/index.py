from utils import algorithms.CArray

from selection_sort import selection_sort
from bubble_sort import bubble_sort
from insertion_sort import insertion_sort
from quick_sort import QuickSort

list = algorithms.CArray(20)
list.set_data()

print('///// ARRAY TO ORDER /////')
print(list.data_store)
print('//////////////////////////')

print('QuickSort')
sortable_array = QuickSort(list.data_store)
sortable_array.quick_sort(0, len(list.data_store) - 1)
print(sortable_array.array)

print('BubbleSort')
print(bubble_sort(list.data_store))

print('SelectionSort')
print(selection_sort(list.data_store))

print('InsertionSort')
print(insertion_sort(list.data_store))
