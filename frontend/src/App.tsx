import BarChart from "components/Chart";
import DataTable from "components/DataTable";
import DonutsChart from "components/DonutsCharts";
import Footer from "components/Footer";
import Navbar from "components/NavBar";




function App() {
  return (
    <>
    <Navbar></Navbar>
    <div  className="container">
      
       <h1 className="text-primary py-3">Dashbord de Vendas</h1>
       <div className="row px-3">
         <div className="col-sm-6">
           <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
         <BarChart/>
         </div>
         <div className="col-sm-6">
           <h5>Taxa de sucesso(%)</h5>
         <DonutsChart/>
         </div>
       

       </div>

       <div className="py-3">
         <h2 className="text-primary">Todas as vendas</h2>
       <DataTable/>
       </div>
     
      
    </div>
    <Footer></Footer>
    </>
  );
}

export default App;
