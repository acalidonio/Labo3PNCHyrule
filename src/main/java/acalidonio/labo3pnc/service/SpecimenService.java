package acalidonio.labo3pnc.service;

import acalidonio.labo3pnc.domain.dto.request.CreateSpecimenRequest;
import acalidonio.labo3pnc.domain.dto.request.UpdateSpecimenRequest;
import acalidonio.labo3pnc.domain.dto.response.PageableResponse;
import acalidonio.labo3pnc.domain.dto.response.SpecimenResponse;

import java.util.UUID;

public interface SpecimenService {
    SpecimenResponse createSpecimen(CreateSpecimenRequest request);
    PageableResponse<SpecimenResponse> getAllSpecimens(int page, int size, String sortBy, String sortOrder);
    SpecimenResponse getSpecimenById(UUID id);
    SpecimenResponse updateSpecimen(UUID id, UpdateSpecimenRequest request);
    SpecimenResponse deleteSpecimen(UUID id);
}