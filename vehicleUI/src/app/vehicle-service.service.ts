import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VehicleServiceService {

  constructor(private http: HttpClient) { }

  getVehicleData(vin:String){
    return this.http.get('http://localhost:8080/vehicles?vin=' + vin,{observe: 'response'});
  }
}
