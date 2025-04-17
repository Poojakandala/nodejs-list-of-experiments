import sqlite3
conn=sqlite3.connect('csea.db')
data=conn.execute("drop table Emp")
print("table deleted successfully")
conn.close()