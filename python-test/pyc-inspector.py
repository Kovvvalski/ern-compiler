# inspect_pyc.py
import marshal
import dis
import importlib._bootstrap_external.py

# Путь к вашему .pyc файлу
pyc_file = '__pycache__/test.cpython-311.pyc'

with open(pyc_file, 'rb') as f:
    # Первые 16 байт - это заголовок (для Python 3.7+)
    magic_number = f.read(4)
    bit_field = f.read(4)
    timestamp = f.read(4)
    size = f.read(4)
    
    # Читаем остальную часть файла, где находится сериализованный объект
    code_obj = marshal.load(f)

# Теперь у вас есть объект кода!
print("--- ОБЪЕКТ КОДА ---")
print(repr(code_obj))
print("\n--- БАЙТ-КОД ИЗ ОБЪЕКТА ---")
dis.dis(code_obj)

print("\n--- КОНСТАНТЫ ---")
print(code_obj.co_consts)

print("\n--- ИМЕНА ---")
print(code_obj.co_names)