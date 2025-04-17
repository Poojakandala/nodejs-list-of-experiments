import sqlite3
conn=sqlite3.connect('csea.db')
print("Opened DataBase successfully")
conn.execute("INSERT INTO Emp VALUES(1,'Ram',27,'HYD',25000)");
conn.execute("INSERT INTO Emp VALUES(2,'Pavani',22,'TPG',35000)");
conn.commit()
print("Records inserted successfully")
conn.close()