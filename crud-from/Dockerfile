# Etapa de construcción
FROM node:18-alpine AS build

WORKDIR /app

# Copiar package.json y package-lock.json
COPY package*.json ./

# Instalar dependencias
RUN npm install

# Copiar el resto del código
COPY . .

# Construir la aplicación para producción
RUN npm run build

# Etapa de producción
FROM nginx:stable-alpine

# Copiar los archivos construidos al directorio de Nginx
COPY --from=build /app/dist /usr/share/nginx/html

# Exponer el puerto 80
EXPOSE 80

# Comando para ejecutar Nginx
CMD ["nginx", "-g", "daemon off;"]

