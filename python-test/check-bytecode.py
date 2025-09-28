import dis


def calculate_sum(a, b):
    result = a + b
    return result

# Применяем dis к функции
dis.dis(calculate_sum)