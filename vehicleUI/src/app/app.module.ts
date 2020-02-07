import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from "@angular/forms";
import { VehicleServiceService } from './vehicle-service.service';
import {HttpClientModule} from "@angular/common/http";
import {AgmCoreModule} from "@agm/core";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule, 
    HttpClientModule, 
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyC75QdoFmCPvNco6XuD6ygJHQXELOe5YUk'
    })
  ],
  providers: [VehicleServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
