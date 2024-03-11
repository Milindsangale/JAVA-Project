# todo_app.py
import sys
from PyQt5.QtWidgets import QApplication, QWidget, QVBoxLayout, QHBoxLayout, QLineEdit, QPushButton, QListWidget

class ToDoApp(QWidget):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("To-Do List App")
        self.setGeometry(100, 100, 400, 300)
        self.tasks = []
        self.layout = QVBoxLayout()

        # Input field
        self.input_field = QLineEdit()

        # Add Task button
        self.add_button = QPushButton("Add Task")
        self.add_button.clicked.connect(self.add_task)

        # Task list
        self.task_list = QListWidget()

        # Arrange widgets
        self.layout.addWidget(self.input_field)
        self.layout.addWidget(self.add_button)
        self.layout.addWidget(self.task_list)
        self.setLayout(self.layout)

    def add_task(self):
        task = self.input_field.text()
        if task:
            self.tasks.append(task)
            self.task_list.addItem(task)
            self.input_field.clear()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = ToDoApp()
    window.show()
    sys.exit(app.exec_())
