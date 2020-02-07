import { Component } from '@angular/core';
import { VehicleServiceService } from './vehicle-service.service';

@Component({
  selector: 'app-root',
  template: `
  <div class="container">
  <h3>Search Vehicle</h3>
  Vehicle Identification Number: <br/>
  <input class="form-control" placeholder="write here"type="text" name="vin" [(ngModel)] = "vin"/>
  <button (click)="submit()" class="btn btn-success">Search</button>
  
  <br/>
  <h3>Vehicle Detail:</h3>

  <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Make</th>
      <th scope="col">Model</th>
      <th scope="col">Plant Country</th>
      <th scope="col">Plant State</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">{{this.make}}</th>
      <td>{{this.model}}</td>
      <td>{{this.plantCountry}}</td>
      <td> {{this.plantState}}</td>
    </tr>
  </tbody>
</table>
  
  
  
 

  </div>
  `,
  styles: []
})
export class AppComponent {
  title = 'vehicleUI';
  vin: String = 'WAUFFAFM3CA000000';
  make;
  model;
  plantCountry;
  plantState;

  constructor(private service: VehicleServiceService){}
  submit(){
    this.service.getVehicleData(this.vin).subscribe(res=>{
      
      if(res.status == 200){
        this.make= res.body.make;
        this.model = res.body.model;
        this.plantCountry = res.body.plantCountry;
        this.plantState = res.body.plantState;
      }else{
        this.make= '';
        this.model = '';
        this.plantCountry = '';
        this.plantState = '';
      }
      
      console.log(res)
    });
  }
}
