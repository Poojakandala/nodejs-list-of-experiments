import sqlite3
conn=sqlite3.connect('csea.db')
data=conn.execute("select *from Emp");
for row in data:
    print("ID = ",row[0])
    print("NAME = ",row[1])
    print("AGE = ",row[2],)
    print("ADDRESS = ",row[3],)
    print("SALARY = ",row[4],"\n")
conn.commit()
conn.close()
