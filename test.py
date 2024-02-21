def find_expense_combination(expenses, total_amount):
    for r in range(1, len(expenses) + 1):
        for combo in combinations(expenses, r):
            if sum(combo) == total_amount:
                return combo
    return None