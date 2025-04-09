package com.kliqs.yourmoney2.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Accounts : Screen("accounts")
    object Transactions : Screen("transactions")
    object Budgets : Screen("budgets")
    object FinancialHealth : Screen("financial_health")
    object Settings : Screen("settings")
    object Profile : Screen("profile")
    object AddAccount : Screen("add_account")
    object AddTransaction : Screen("add_transaction")
    object AddBudget : Screen("add_budget")
    object TransactionDetails : Screen("transaction_details/{transactionId}") {
        fun createRoute(transactionId: String) = "transaction_details/$transactionId"
    }
    object BudgetDetails : Screen("budget_details/{budgetId}") {
        fun createRoute(budgetId: String) = "budget_details/$budgetId"
    }
    object AccountDetails : Screen("account_details/{accountId}") {
        fun createRoute(accountId: String) = "account_details/$accountId"
    }
}

sealed class NavEvent {
    data class NavigateTo(val route: String) : NavEvent()
    object NavigateBack : NavEvent()
    object NavigateToRoot : NavEvent()
} 