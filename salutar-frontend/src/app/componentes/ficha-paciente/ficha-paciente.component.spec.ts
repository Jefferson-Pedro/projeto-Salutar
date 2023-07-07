import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FichaPacienteComponent } from './ficha-paciente.component';

describe('FichaPacienteComponent', () => {
  let component: FichaPacienteComponent;
  let fixture: ComponentFixture<FichaPacienteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FichaPacienteComponent]
    });
    fixture = TestBed.createComponent(FichaPacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
