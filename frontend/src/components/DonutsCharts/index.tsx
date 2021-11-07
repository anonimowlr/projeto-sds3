import React, { useEffect, useState } from 'react';
import ReactApexChart  from "react-apexcharts";
import Dados  from  '../../dados/Dados';
import axios from "axios"


const DonutsChart = () => {

   
    

    return(

        <ReactApexChart  
        options={{...Dados,labels:Dados.labels}} series={Dados.series} type="donut" height={350}></ReactApexChart >



    );
}

 
export default DonutsChart;