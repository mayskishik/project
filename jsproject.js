
window.addEventListener('DOMContentLoaded', event => {

    // Activate Bootstrap scrollspy on the main nav element
    const sideNav = document.body.querySelector('#sideNav');
    if (sideNav) {
        new bootstrap.ScrollSpy(document.body, {
            target: '#sideNav',
            offset: 74,
        });
    };

    // Collapse responsive navbar when toggler is visible
    const navbarToggler = document.body.querySelector('.navbar-toggler');
    const responsiveNavItems = [].slice.call(
        document.querySelectorAll('#navbarResponsive .nav-link')
    );
    responsiveNavItems.map(function (responsiveNavItem) {
        responsiveNavItem.addEventListener('click', () => {
            if (window.getComputedStyle(navbarToggler).display !== 'none') {
                navbarToggler.click();
            }
        });
    });

});
const startButton = document.getElementById('start-btn')
const nextButton = document.getElementById('next-btn')
const questionContainerElement = document.getElementById('question-container')
const questionElement = document.getElementById('question')
const answerButtonsElement = document.getElementById('answer-buttons')

let shuffledQuestions, currentQuestionIndex

startButton.addEventListener('click', startGame)
nextButton.addEventListener('click', () => {
    currentQuestionIndex++
    setNextQuestion()
})

function startGame() {
    startButton.classList.add('hide')
    shuffledQuestions = questions.sort(() => Math.random() - .5)
    currentQuestionIndex = 0
    questionContainerElement.classList.remove('hide')
    setNextQuestion()
}

function setNextQuestion() {
    resetState()
    showQuestion(shuffledQuestions[currentQuestionIndex])
}

function showQuestion(question) {
    questionElement.innerText = question.question
    question.answers.forEach(answer => {
        const button = document.createElement('button')
        button.innerText = answer.text
        button.classList.add('btn')
        if (answer.correct) {
            button.dataset.correct = answer.correct
        }
        button.addEventListener('click', selectAnswer)
        answerButtonsElement.appendChild(button)
    })
}

function resetState() {
    clearStatusClass(document.body)
    nextButton.classList.add('hide')
    while (answerButtonsElement.firstChild) {
        answerButtonsElement.removeChild(answerButtonsElement.firstChild)
    }
}

function selectAnswer(e) {
    const selectedButton = e.target
    const correct = selectedButton.dataset.correct
    setStatusClass(document.body, correct)
    Array.from(answerButtonsElement.children).forEach(button => {
        setStatusClass(button, button.dataset.correct)
    })
    if (shuffledQuestions.length > currentQuestionIndex + 1) {
        nextButton.classList.remove('hide')
    } else {
        startButton.innerText = 'ابدأ من جديد'
        startButton.classList.remove('hide')
    }
}

function setStatusClass(element, correct) {
    clearStatusClass(element)
    if (correct) {
        element.classList.add('correct')
    } else {
        element.classList.add('wrong')
    }
}

function clearStatusClass(element) {
    element.classList.remove('correct')
    element.classList.remove('wrong')
}

const questions = [
    {
        question: 'المسجد الاقصى هو ',
        answers: [
            { text: 'القبة الذهبية الصفراء', correct: false },
            { text: 'المسجد القبلي', correct: false },
            { text: 'المسجد المرواني', correct: false },
            { text: 'كل ما داخل سور المسجد الاقصى من ساحات و مصليات', correct: true }


        ]
    },
    {
        question: 'يعتبر المسجد الاقصى',
        answers: [
            { text: 'ثاني مسجد وضع في الارض', correct: true },
            { text: 'اول مسجد وضع في الارض', correct: false },
            { text: 'ثالث مسجد وضع في الارض', correct: false },
            { text: 'خامس مسجد وضع في الارض', correct: false }
        ]
    },
    {
        question: 'الحارة التي دمرها الاحتلال الإسرائيلي بجوار حائط البراق تدميرا كاملا هي؟',
        answers: [
            { text: 'حارة النصارى ', correct: false },
            { text: 'حارة القطانين', correct: false },
            { text: 'حارة السعدية', correct: false },
            { text: 'حارة المغاربة', correct: true }
        ]
    },
    {
        question: 'تبلغ مساحة المسجد الأقصى',
        answers: [
            { text: '122 دونما', correct: false },
            { text: '166 دونما', correct: false },
            { text: '144 دونما', correct: true },
            { text: '155 دونما', correct: false }
        ]
    },
    {
        question: 'كم عدد مآذن المسجد الأقصى المبارك؟',
        answers: [
            { text: '3', correct: false },
            { text: '5', correct: false },
            { text: '4', correct: true },
            { text: '6', correct: false }
        ]
    },

    {
        question: 'الصحابي الذي بنى مسجدا صغيرا في القدس؟',
        answers: [
            { text: 'عمر بن الخطاب', correct: true },
            { text: 'عثمان بن عفان', correct: false },
            { text: 'علي بن ابي طالب', correct: false },
            { text: 'ابو بكر ', correct: false }
        ]
    }
]
