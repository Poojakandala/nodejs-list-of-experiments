import sqlite3
conn=sqlite3.connect('cseabc.db')
cursor=conn.cursor()
cursor.execute('''CREATE TABLE IF NOT EXISTS users(
                id INTEGER PRIMARY KEY AUTO INCREMENT,
                name TEXT NOT NULL,
                age INTEGER NOT NULL
            )''')
cursor.execute("INSERT INTO users (name,age) VALUES ('A',25)")
cursor.execute("INSERT INTO users (name,age) VALUES ('B',30)")
cursor.execute("INSERT INTO users (name,age) VALUES ('C',35)")
conn.commit()
print("\n Before deletion:")
cursor.execute("SELECT * FROM users")
for row in cursor.fetchall():
    print(row)
cursor.execute("DELETE FROM users WHERE name = 'B'")
conn.commit()
print("\nAfter Deletion:")
cursor.execute("SELECT * FROM users")
for row in cursor.fetchall():
    print(row)
conn.close()