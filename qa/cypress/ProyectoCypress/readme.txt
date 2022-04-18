Comandos para crear proyectos cypress:
npm init
npm -version
Si hace falta update a la nueva versión: npm install -g npm@8.7.0 (los números se sustituyen por las nuevas versiones)
npm install cypress --save-dev
Abrir Cypress de forma normal es: ./node_modules/.bin/cypress open
Después de configurar el package.json (apartado scripts: "cypress:open": "cypress open") se arranca con este comando con mayor facilidad en vez del otro modo: npm run cypress:open