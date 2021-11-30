const {Pool} = require('pg')

const pool = new Pool({
  user: 'postgres',
  host: '37.44.244.235',
  database: 'modis_backend_dev',
  password: 'dbapptgprK2021',
  port: 5432
})


module.exports = {
  query : (text, params, result) =>pool.query(text, params, result)
}