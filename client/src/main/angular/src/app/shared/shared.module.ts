import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FooterComponent } from './layout/footer/footer.component';
import { HeaderComponent } from './layout/header/header.component';

@NgModule({
  imports: [
    CommonModule
  ],
  exports: [
	FooterComponent,HeaderComponent
  ],
  declarations: [FooterComponent, HeaderComponent]
})
export class SharedModule { }
