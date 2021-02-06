require "mysql2"

client = Mysql2::Client.new(:host => "localhost", :username => "root", database: "local-test")
table_name = "first"

def insert_sql(table_name, values)
  "INSERT INTO #{table_name} VALUES (#{values.join(', ')});"
end

def select_sql(table_name, columns)
  "SELECT #{columns.join(', ')} FROM #{table_name};"
end

1.upto(1000) do |i|
  values = {
    id: i,
    name: "\"name-#{i}\"",
    age: i,
    email: "\"email-#{i}@sample.com\"",
    sex: i%2 == 0 ? "\"male\"":"\"female\"",
    role: "\"member\"",
    float: 0.11,
    double: 0.23
  }.values
  sql = insert_sql(table_name, values)
  client.query sql
end

results = client.query(select_sql(table_name, ["*"]))
results.each { |row| puts row }