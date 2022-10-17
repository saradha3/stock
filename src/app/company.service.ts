import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  constructor(private http: HttpClient) { }

  public addCompany(company: any){
    return this.http.post(`${baseUrl}/api/v1.0/market/company/register`,company);
  }

}
