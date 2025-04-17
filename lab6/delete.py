import sqlite3
conn=sqlite3.connect('csea.db')
data=conn.execute("delete from Emp where ID=2");
data=conn.execute("commit")
conn.close()