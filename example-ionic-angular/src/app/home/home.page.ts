import { Component } from '@angular/core';
import { RateApp } from 'capacitor-rate-app';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor() {}

  public async handleRequestReview(){
    try {
      await RateApp.requestReview();
      alert('Review request successful');
    } catch (error) {
      console.log(error);
      alert(`Review request failed: ${(error as any)?.message}`);
    }
  };

}
