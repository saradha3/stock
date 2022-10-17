import { Component, OnInit } from '@angular/core';
import { CompanyService } from '../../company.service';

@Component({
  selector: 'app-company-registration',
  templateUrl: './company-registration.component.html',
  styleUrls: ['./company-registration.component.css']
})
export class CompanyRegistrationComponent implements OnInit {

  company = {
    companycode: "",
    companyname: "",
    companyceo: "",
    companyturnover: "",
    companywebsite: "",
    stockexchange: ""
  };
  

  constructor(private companyService: CompanyService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.companyService.addCompany(this.company).subscribe(
      (data)=>{
        console.log(data);
        alert("success");
      },
      (error) =>{
        console.log(error);
        alert(error.error.message);
      }
    );
  }

}
