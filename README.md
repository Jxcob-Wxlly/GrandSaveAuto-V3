# GrandSaveAuto V3 (GSA)

A gamified budgeting app built in Kotlin/Android Studio.  
It merges financial tracking with RPG-style mechanics: users earn EXP, level up, and progress through classes by managing their money wisely.

---

## Features

- **Single-Activity Architecture**  
  All screens are Fragments managed by Jetpack Navigation Component:
    - HomeFragment (dashboard, RPG stats, navigation buttons)
    - AddExpenseFragment (log expenses into RoomDB)
    - HistoryFragment (RecyclerView list of expenses)
    - BudgetFragment (monthly categories + bank account linking)
    - RemindersFragment (placeholder for payment reminders)

- **Dashboard (HomeFragment)**  
  Shows user profile, coins, streaks, and RPG stats (ATK, DEF, DEX, INT, LUK).  
  Provides quick navigation to Add Expense, Categories, Expense History, Budget Setup, and Reminders.

- **Add Expense (AddExpenseFragment)**  
  Log expenses with amount, category, description, and optional wasteful flag.  
  Saves directly into RoomDB via ViewModel.

- **Expense History (HistoryFragment)**  
  Displays logged expenses in a RecyclerView.  
  Uses RoomDB + LiveData/Flow for persistence.

- **Budget Setup (BudgetFragment)**  
  Create monthly categories, assign amounts, and link a bank account.  
  Save and track your budget progress (RoomDB integration planned).

- **Reminders (RemindersFragment)**  
  Placeholder UI for adding reminders.  
  Future integration with RoomDB or AlarmManager.

- **Gamification**  
  Earn EXP, level up, and unlock classes: Novice → Apprentice → Coin Warrior → Budget Knight → Master Saver.

---

## Tech Stack

- Kotlin
- AndroidX + Material Components
- Jetpack Navigation Component
- RoomDB (entities, DAO, repository, ViewModel)
- Gradle 9.4.1
- JDK 12

---

## Screenshots
(docs/screenshots)

## Video Link
https://youtube.com/shorts/Nl5AT0450p8?si=EYscLmvxekJDpoHA

