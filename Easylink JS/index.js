const express = require("express");
const EasyLink = require("easylink-js");
const PORT = process.env.PORT || 3012;

const app = express();
const pool = require('./koneksi'); 

const easyLink = new EasyLink({
    host: 'http://192.168.10.8:8080',
    serialNumber: 'Fio66208021230422'
  });

 
 (async function(){
    const deviceInfo = await easyLink.getDeviceInfo(); 
    console.log(deviceInfo);
  
})();

setInterval(function(){
 //console.log('test');
  doSomething();  
},  5000);     

async function doSomething()
{
      const scanlogs = await easyLink.getNewScanLogs();
      //console.log(scanlogs.length);
      if (scanlogs.length>0)
      {
        console.log(scanlogs);
        for (i=0;i<scanlogs.length;i++)
        {
          // console.log(scanlogs[i]["PIN"]);
          // console.log(scanlogs[i]["WorkCode"]);
          // console.log(scanlogs[i]["SN"]);
          // console.log(scanlogs[i]["VerifyMode"]);
          // console.log(scanlogs[i]["ScanDate"]);
          // console.log(scanlogs[i]["IOMode"]);
          var PIN = scanlogs[i]["PIN"];
          var SN = scanlogs[i]["SN"];
          var jenis_absen;
          var IOMode = scanlogs[i]["IOMode"]
          var created_at = scanlogs[i]["ScanDate"];
          if (IOMode==1)
          {
              jenis_absen="IN";
          }
          else
          {
              jenis_absen="OUT";
          }

          pool.query('INSERT INTO "Transaksi_Absen" (jenis_absen,kategori_absen,created_at,is_mobile,serial_number_mesin,id_pegawai) VALUES ($1, $2, $3, $4, $5,$6)', [jenis_absen, "WFO", created_at, "FALSE",SN,PIN ], (error, results) =>{
            if (error) 
            {
              // throw error
              //response.status(201).send(error)
              console.log('Error:'+error);
              if (error.code == '23505')
              {
                  //console.log("\n ERROR! \n Individual with name: " + body.fname + " " + body.lname + " and phone #: " + body.phone + " is a duplicate member. \n");
                  //response.status(400).send('Duplicate data')
                  console.log('Duplicate data');
                  return;
              }
            }
            else
            {
              //response.status(200).send({success:true,message:'New presence'})
              console.log('Sukses');
              return;
            }
          })
        }
        
      }
      
}

app.listen(PORT, () => {
    console.log(`listening on port ${PORT}`);
});