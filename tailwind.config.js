const defaultTheme = require('tailwindcss/defaultTheme')

module.exports = {
    // in prod look at shadow-cljs output file in dev look at runtime, which will change files that are actually compiled; postcss watch should be a whole lot faster
    // content: process.env.NODE_ENV == 'production' ? ["./public/js/main.js"] : ["./public/js/cljs-runtime/*.js"],
    content: process.env.NODE_ENV == 'production' ? ["./docs/js/main.js"] : ["./docs/js/cljs-runtime/*.js"],
    theme: {
        extend: {
            fontFamily: {
                sans: ["Inter var", ...defaultTheme.fontFamily.sans],
            },
        },
    },
    plugins: [
        require('@tailwindcss/forms'),
    ],
}