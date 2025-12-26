# QueueUsingArray-Under-the-hood

This repository contains a Java implementation of a **Queue data structure using arrays**, built from scratch to understand how queues work internally without using Java’s built-in collection framework.

---

## 📌 What is a Queue?

A **Queue** is a linear data structure that follows the  
**FIFO (First In, First Out)** principle.


---

## 📂 Project Structure

QueueUsingArray-Under-the-hood/
├── queue1/
│ ├── QueueEmptyException.java
│ ├── QueueFullException.java
│ ├── QueueUse.java
│ ├── QueueUse1.java
│ ├── QueueUsingArray.java
│ └── QueueUsingArray1.java
└── README.md

---

## ⚙️ Features Implemented

- Queue implementation using **arrays**
- `enqueue()` operation
- `dequeue()` operation
- `front()` operation
- Custom exception handling:
  - Queue Overflow
  - Queue Underflow

---

## 🧠 How the Queue Works

- Uses a fixed-size array
- Maintains `front`, `rear`, and `size`
- Ensures FIFO order
- Throws custom exceptions when:
  - Queue is full
  - Queue is empty

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Mrutunjaya-Panda/QueueUsingArray-Under-the-hood-
2. Open the project in your Java IDE (VS Code / IntelliJ / Eclipse)
3. Run:
   i) QueueUse.java :- for fixed size queue implementation.

   ii) QueueUse1.java :- for dynamic size queue implementation.

⏱️ Time Complexity
  Operation	 Time Complexity
  Enqueue	   O(1)
  Dequeue	   O(1)
  Front	     O(1)

📝 License

   This project is open-source and free to use for learning and educational purposes.
