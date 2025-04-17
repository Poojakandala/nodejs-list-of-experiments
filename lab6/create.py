import sqlite3
conn=sqlite3.connect('csea.db')
print("DataBase Created and Opened database successfully")
conn.close()