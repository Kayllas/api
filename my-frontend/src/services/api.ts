const API_URL = "http://localhost:8080";

export const fetchPacientes = async (page: number, size: number): Promise<any> => {
  try {
    const response = await fetch(`${API_URL}/pacientes?page=${page}&size=${size}`);
    if (!response.ok) {
      throw new Error(`Erro na resposta da API: ${response.status} ${response.statusText}`);
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error("Erro ao buscar pacientes:", error);
    throw error;
  }
};

export const fetchMedicos = async (page: number, size: number): Promise<any> => {
  try {
    const response = await fetch(`${API_URL}/medicos?page=${page}&size=${size}`);
    if (!response.ok) {
      throw new Error(`Erro na resposta da API: ${response.status} ${response.statusText}`);
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error("Erro ao buscar médicos:", error);
    throw error;
  }
};
